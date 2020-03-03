package top.tomxwd.chapter01;

/**
 * 顺序表存储结构实现
 *
 * @author xieweidu
 * @createDate 2020-03-02 23:11
 */
public class SequentialList<T> implements ListInterface<T> {

    /**
     * 顺序表存储
     */
    private T[] list;

    /**
     * 数组最大容量
     */
    private final static int LIST_MAX_SIZE = 100;

    /**
     * 表长
     */
    private int length;

    /**
     * 默认构造函数
     * 创建一个长度为100的空数组，初始化表长为0
     */
    public SequentialList() {
        list = (T[]) (new Object[LIST_MAX_SIZE]);
        length = 0;
    }

    /**
     * 有参构造器
     *
     * @param initialList
     */
    public SequentialList(T[] initialList) {
        // 仍然是创建最大长度为100的数组
        list = (T[]) (new Object[LIST_MAX_SIZE]);
        length = initialList.length;
        if (length > LIST_MAX_SIZE) {
            // 数组越界
            throw new ListException("构造线性表，长度越界");
        }
        for (int i = 0; i < length; i++) {
            list[i] = initialList[i];
        }
    }

    @Override
    public void printList() {
        if (isEmpty()) {
            System.out.println("空表");
            return;
        }
        for (int i = 0; i < length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }

    @Override
    public int length() {
        return this.length;
    }

    @Override
    public int locate(T element) {
        int result = 0;
        for (int i = 0; i < length; i++) {
            if (list[i].equals(element)) {
                result = i;
                break;
            }
        }
        return result;
    }

    @Override
    public T getElement(int i) {
        if (isEmpty()) {
            throw new ListException("表空");
        }
        if (i < 0 || i >= length) {
            throw new ListException("位置非法");
        }
        return list[i];
    }

    @Override
    public void insert(int i, T element) {
        if (length == list.length) {
            throw new ListException("线性表满，插入异常");
        }
        if (i < 1 || i >= length - 1) {
            throw new ListException("插入位置异常");
        }
        for (int index = length; index >= i; index--) {
            list[index] = list[index - 1];
        }
        list[i] = element;
        length++;
    }

    @Override
    public T delete(int i) {
        if (isEmpty()) {
            throw new ListException("线性表空");
        }
        if (i < 1 || i >= length) {
            throw new ListException("删除位置异常");
        }
        T element = list[i];
        for (int j = i; j < length; j++) {
            list[j] = list[j + 1];
        }
        length--;
        return element;
    }

    @Override
    public boolean isEmpty() {
        if (length == 0) {
            // 长度为0则为空列表
            return true;
        }
        return false;
    }
}
