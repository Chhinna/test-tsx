import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;
import org.apache.commons.text.StringEscapeUtils;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Example {
    public static class Settings { public String name; }
    public static Object readYaml(String text) {
        return new Yaml(new Constructor(Settings.class)).load(text);
    }
    public static String escape(String text) {
        return StringEscapeUtils.escapeHtml4(text);
    }
    public static Object readJson(String text) throws Exception {
        return new ObjectMapper().readTree(text);
    }
}
