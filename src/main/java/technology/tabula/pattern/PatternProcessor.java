package technology.tabula.pattern;

import lombok.Getter;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

//todo move to => mongo
public class PatternProcessor {
    @Getter
    private List<Pattern> patterns;

   public void register(Pattern newPattern) {
        patterns.add(newPattern);
    }

    private static PatternProcessor instance;

    private PatternProcessor(){
        patterns = new ArrayList<>();
    }

    public static synchronized PatternProcessor getInstance(){
        if(instance == null){
            instance = new PatternProcessor();
        }
        return instance;
    }

    public Pattern getByFileName(File file) {
        return patterns.stream().filter(p -> p.name.equals(file.getName())).findFirst().orElse(null);
    }
}
