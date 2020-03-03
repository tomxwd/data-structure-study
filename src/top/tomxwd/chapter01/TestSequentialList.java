package top.tomxwd.chapter01;

/**
 * 测试顺序表类
 *
 * @author xieweidu
 * @createDate 2020-03-03 22:12
 */
public class TestSequentialList {

    public static void main(String[] args) {
        String[] initialList = {"a", "b", "c", "d", "e", "f"};
        SequentialList<String> list = new SequentialList<>(initialList);
        System.out.println("线性表的长度：" + list.length());
        list.printList();
        String item2 = list.getElement(2);
        System.out.println("item2 = " + item2);
        int d = list.locate("d");
        System.out.println("d.index = " + d);
        System.out.println("3号位置插入k");
        list.insert(3, "k");
        String element = list.getElement(3);
        System.out.println("index = 3 element = " + element);
        list.printList();
        System.out.println("删除第三个位置的元素");
        String delete = list.delete(3);
        System.out.println("删除的元素为：" + delete);
        System.out.println("线性表长度：" + list.length());
        list.printList();
    }
}
