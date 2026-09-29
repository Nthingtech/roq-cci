import io.quarkiverse.roq.data.runtime.annotations.DataMapping;

import java.util.List;

@DataMapping(value = "features", parentArray = true)
public record SistemaFeatures(List<Feature> list) {

    public record Feature(String title, String icon, String description) {
    }
}
