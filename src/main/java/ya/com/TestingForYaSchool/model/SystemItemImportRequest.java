package ya.com.TestingForYaSchool.model;

import lombok.Data;

import java.util.List;

@Data
public class SystemItemImportRequest {
    private List<SystemItemImport> items;
    private String updateDate;
}
