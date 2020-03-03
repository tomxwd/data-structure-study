package top.tomxwd.chapter01;

/**
 * 线性表接口
 * @author xieweidu
 * @createDate 2020-03-02 23:08
 */
public interface ListInterface<T> {

    /**
     * 遍历线性表
     */
    void printList();

    /**
     * 线性表长度
     * @return
     */
    int length();

    /**
     * 按值查找
     * @param element
     * @return
     */
    int locate(T element);

    /**
     * 按索引位置查找元素
     * @param i
     * @return
     */
    T getElement(int i);

    /**
     * 指定索引插入元素
     * @param i
     * @param element
     */
    void insert(int i,T element);

    /**
     * 删除指定索引元素
     * @param i
     * @return
     */
    T delete(int i);

    /**
     * 判断表空
     * @return
     */
    boolean isEmpty();

}
