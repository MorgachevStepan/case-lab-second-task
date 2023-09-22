package Exception;

/**
 * @author Stepan Morgachev
 * @date 20.09.2023 18:48
 */
public class Main {
    public static void main(String[] args){
        ArrayListWith10Elements<Integer> arrayListWith10Elements = new ArrayListWith10Elements<Integer>();
        try {
            for (int i = 0; i < 10; i++)
                arrayListWith10Elements.add(i);
        }catch (DoNotAddMore10Elements doNotAddMore10Elements){
            System.err.println("Нельзя добавлять больше 10 элементов");
        }
        System.out.println("Добавили 10 элементов");
        try{
            arrayListWith10Elements.add(11);
            System.out.println("Добавили 11 элементов");
        } catch (DoNotAddMore10Elements doNotAddMore10Elements){
            System.err.println(doNotAddMore10Elements.getMessage());
        }
    }
}
