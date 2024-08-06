package cm.belrose;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Slf4j
@Component
@ConfigurationProperties(prefix = "myapp1")
@Data
@AllArgsConstructor
@Builder
public class InputMapProperties {

    private final Map<String,String> stringMap;

    /**
     * getting a list of values from map
     */
    public List<String> getLists() {
        return getStringMap().values()
                .stream()
                .map(String::new)
                .toList();
    }


}
