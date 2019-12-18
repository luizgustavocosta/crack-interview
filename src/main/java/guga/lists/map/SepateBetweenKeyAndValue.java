package guga.lists.map;

import java.time.ZonedDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.Objects.nonNull;
import static java.util.stream.Collectors.toMap;

/**
 * The type Sepate between key and value.
 */
public class SepateBetweenKeyAndValue implements MyKeyAndValue<ZonedDateTime, String>  {

    @Override
    public Map<ZonedDateTime, String> separateList(List<Person> list) {
        Map<ZonedDateTime, String> collect = null;
        if(nonNull(list)) {
            collect = list.stream()
                    .collect(toMap(Person::getDateOfBirth, Person::getName));
        } else {
            collect = Collections.emptyMap();
        }
        return collect;
    }
}
