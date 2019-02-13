package technology.tabula.pattern;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
public class Pattern {
    /**
     * vendor name
     */
    @Getter
    String name;

    /**
     * what the tables look like
     */
    @Getter
    List<TableHeader> headers;
}
