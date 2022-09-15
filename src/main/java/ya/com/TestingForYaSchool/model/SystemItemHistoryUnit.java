package ya.com.TestingForYaSchool.model;

import lombok.Data;

@Data
public class SystemItemHistoryUnit {
    private String id;
    private String url;
    private String parentId;
    private SystemItemType type;
    private int size;
    private String date;
}
