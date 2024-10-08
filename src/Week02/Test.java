package Week02;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String structure = sc.nextLine();

        // 자료 구조 타입이 틀렸을 경우 오류 문자 반환 후 종료
        if (Objects.equals(structure, "List") || Objects.equals(structure, "Set") || Objects.equals(structure, "Map")) {
            String recipe = sc.nextLine();
            int count = 0;

            switch (structure) {
                case "List":
                    ArrayList<String> list = new ArrayList<String>();

                    while(true) {
                        String recipes = sc.nextLine();

                        if(Objects.equals(recipes, "끝")){
                            break;
                        }
                        list.add(recipes);
                    }

                    System.out.println("[ " + structure + " 으로 저장된 " + recipe + " ]");

                    for (String s : list) {
                        count++;
                        System.out.println(count + ". " + s);
                    }
                    break;
                case "Set":
                    Set<String> set = new LinkedHashSet<String>();

                    while(true) {
                        String recipes = sc.nextLine();

                        if(Objects.equals(recipes, "끝")){
                            break;
                        }
                        set.add(recipes);
                    }

                    System.out.println("[ " + structure + " 으로 저장된 " + recipe + " ]");

                    for(String s : set) {
                        count++;
                        System.out.println(count + ". " + s);
                    }
                    break;
                case "Map":
                    Map<Integer, String> map = new HashMap<>();

                    while(true) {
                        String recipes = sc.nextLine();

                        if(Objects.equals(recipes, "끝")){
                            count = 0;
                            break;
                        }
                        map.put(count, recipes);
                        count++;
                    }

                    System.out.println("[ " + structure + " 으로 저장된 " + recipe + " ]");

                    for(Integer key : map.keySet()) {
                        count++;
                        System.out.println(count + ". " + map.get(key));
                    }
                    break;
                default:
                    break;
            }
        } else {
            System.out.println("ERROR : 자료 구조 타입이 잘못 되었습니다.");
        }


    }
}
