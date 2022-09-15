package ya.com.TestingForYaSchool.model;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class SystemItemImport {
    @NotNull
    private String id;
    private String url;
    private String parentId;
    private SystemItemType type;
    private int size;
}
