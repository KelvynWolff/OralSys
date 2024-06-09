package oralsys.controller;

import java.util.LinkedList;
import java.util.List;
import oralsys.entidades.Cidade;
import oralsys.entidades.Endereco;
import oralsys.entidades.Paciente;
import oralsys.persistencia.EnderecoDao;
import oralsys.persistencia.ConverterEntidades;
import org.json.JSONArray;
import org.json.JSONObject;

public class EnderecoController implements Controller {
    private EnderecoDao enderecoDao;
    private ConverterEntidades converterEntidades;

    public EnderecoController(EnderecoDao enderecoDao, ConverterEntidades converterEntidades) {
        this.enderecoDao = enderecoDao;
        this.converterEntidades = converterEntidades;
    }

    @Override
    public Endereco converte(JSONObject json) {
        if (json == null) {
            throw new IllegalArgumentException("O objeto JSON não pode ser nulo");
        }

        Endereco endereco = new Endereco();

        if (json.has("cidadeId")) {
            Long cidadeId = json.getLong("cidadeId");
            Cidade cidade = converterEntidades.converterCidadePorId(cidadeId);
            endereco.setCidade(cidade);
        }

        if (json.has("pacientesIds")) {
            JSONArray pacientesIds = json.getJSONArray("pacientesIds");
            List<Paciente> pacientes = converterEntidades.converterPacientesPorIds(pacientesIds);
            endereco.setPacientes(pacientes);
        }

        endereco.setRua(json.optString("rua"));

        return endereco;
    }

    public String cadastrarEndereco(JSONObject enderecoJSON) {
        List<String> status = new LinkedList<>();

        if (!enderecoJSON.has("cidadeId") || enderecoJSON.optString("cidadeId").isEmpty()) {
            status.add("Cidade inválida!");
        }
        if (!enderecoJSON.has("pacientesIds") || enderecoJSON.optString("pacientesIds").isEmpty()) {
            status.add("Pacientes inválidos!");
        }
        if (enderecoJSON.optString("rua").isEmpty()) {
            status.add("Rua inválida!");
        }

        if (status.isEmpty()) {
            try {
                Endereco endereco = converte(enderecoJSON);
                enderecoDao.salvar(endereco);
                status.add("Sucesso!");
            } catch (IllegalArgumentException e) {
                status.add(e.getMessage());
            }
        }

        return String.join(", ", status);
    }

    public String alterarEndereco(String id, JSONObject enderecoJSON) {
        List<String> status = new LinkedList<>();

        if (id == null || id.isEmpty()) {
            status.add("ID Inválido!");
        }

        if (status.isEmpty()) {
            Long enderecoId = Long.parseLong(id);
            Endereco endereco = enderecoDao.buscarPorId(enderecoId);

            if (endereco != null) {
                if (enderecoJSON.has("cidadeId") && !enderecoJSON.optString("cidadeId").isEmpty()) {
                    Long cidadeId = enderecoJSON.getLong("cidadeId");
                    Cidade cidade = converterEntidades.converterCidadePorId(cidadeId);
                    endereco.setCidade(cidade);
                }
                if (enderecoJSON.has("pacientesIds")) {
                    JSONArray pacientesIds = enderecoJSON.getJSONArray("pacientesIds");
                    List<Paciente> pacientes = converterEntidades.converterPacientesPorIds(pacientesIds);
                    endereco.setPacientes(pacientes);
                }
                if (enderecoJSON.has("rua") && !enderecoJSON.optString("rua").isEmpty()) {
                    endereco.setRua(enderecoJSON.getString("rua"));
                }
                enderecoDao.atualiza(endereco);
                status.add("Sucesso!");
            } else {
                status.add("Endereço não encontrado!");
            }
        }

        return String.join(", ", status);
    }

    public String excluirEndereco(String id) {
        List<String> status = new LinkedList<>();

        if (id == null || id.isEmpty()) {
            status.add("ID Inválido!");
        }

        if (status.isEmpty()) {
            Long enderecoId = Long.parseLong(id);
            Endereco endereco = enderecoDao.buscarPorId(enderecoId);

            if (endereco != null) {
                enderecoDao.remove(endereco);
                status.add("Sucesso!");
            } else {
                status.add("Endereço não encontrado!");
            }
        }

        return String.join(", ", status);
    }
}