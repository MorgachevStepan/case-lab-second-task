package Exception;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Stepan Morgachev
 * @date 20.09.2023 18:45
 */
public class ArrayListWith10Elements<T> {
    private final List<T> arrayList;

    public ArrayListWith10Elements() {
        this.arrayList = new ArrayList<T>();
    }

    public void add(T element) throws DoNotAddMore10Elements{
        if(arrayList.size() == 10) {
            throw new DoNotAddMore10Elements("Нелья добавлять больше 10 элементов");
        }
        else {
            arrayList.add(element);
        }
    }
}
