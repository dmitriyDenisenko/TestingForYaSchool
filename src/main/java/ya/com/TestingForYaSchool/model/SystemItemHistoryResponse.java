package ya.com.TestingForYaSchool.model;

import lombok.Data;

import java.util.List;

@Data
public class SystemItemHistoryResponse {
    private List<SystemItemHistoryUnit> items;
}
