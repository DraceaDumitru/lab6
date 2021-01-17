package lists;


import java.util.*;

public class Lists {
    public void setName(List<String> myList) {
        //Ex 1
        Set<String> stringSet = new LinkedHashSet<>();
        myList.add("David");
        myList.add("Yuno");
        myList.add("Asta");
        myList.add("Yami");
        myList.add("Gum");
        int i = 0;
        for (String value : stringSet) {
            if (i < stringSet.size() - 1) {
                System.out.print(value + ",");
            } else {
                System.out.print(value);
            }
            i++;
        }
    }

    public void addNumber(List<Integer> number, double real) {
        //Ex 2
        int[] items = new int[]{1, 2, 3, 4};
        ArrayList<Integer> list = new ArrayList<>();
       // Collections.addAll(list, 5D); Aici nu merge add all e cu rosu nu stiu de ce 
        int endOfList = list.size();
        ((ArrayList<Integer>) list).set(endOfList, 5);
        System.out.println(Collections.singletonList(list));
    }

    public void displayNewNumberOnANewLine(List<Integer> number, int nr) {
        //Ex 3 Nu stiu sa il fac

    }

    public ArrayList<Integer> oppositeDisplay(List<Integer> alist) {
        //Ex 4
        ArrayList<Integer> revArrayList = new ArrayList<Integer>();
        for (int i = alist.size() - 1; i >= 0; i--) {

            revArrayList.add(alist.get(i));
        }

        return revArrayList;
    }

    public void printElements(ArrayList<Integer> alist) {
        for (int i = 0; i < alist.size(); i++) {
            System.out.print(alist.get(i) + " ");
        }

    }

    public void addValue(List<String> val, int num, String value) {
        //Ex 5

    }

    public void addFirstParameterOnPosition(List<String> a, char b) {
        //Ex 6
        List<String> newList = new ArrayList<>();
        newList.add("foo");
        newList.addAll(Arrays.asList("b"));

        newList.toArray(new String[newList.size()]);
    }

    public void displayAValueOnAPositionAndShowIt(List<Character> number) {
        //Ex 7
        List<Character> myChar = new ArrayList<Character>();
        myChar.add('A');
        myChar.add('B');
        myChar.add('C');
        myChar.add('D');
        for (int i=0;i < myChar.size();i++)
        {
           // Logger.i("Value of element "+i,myChar.get(i));  Nu merge sa ii pun nume si nici i-ul nu merge
        }
    }

    public void returnBigNr(List<Integer> number) {
        //Ex 8 Habar nu am de ce imi taie integerul
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        arrayList.add(new Integer("3"));
        arrayList.add(new Integer("1"));
        arrayList.add(new Integer("8"));
        arrayList.add(new Integer("3"));
        arrayList.add(new Integer("5"));

        Object obj = Collections.max(arrayList);
        System.out.println(obj);
    }
}