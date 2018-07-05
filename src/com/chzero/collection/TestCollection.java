package com.chzero.collection;

import java.util.*;

/**
 * @author CHZERO
 * @version 1.0
 * @date 2018-07-05 14:59
 * @email 827348260@qq.com
 * @description 存储对象可以考虑使用 数组 和 集合
 *
 * 1. 数组存储对象的特性: 弊端->创建数组后其长度不可改变; 实际使用空间不可知;
 * 2. java集合工具类: Collection
 * |-- Set : 元素无序, 不可重复的集合
 * |-- List: 元素有序, 可重复的集合
 */
public class TestCollection{

    public static void main(String[] args){
        Collection<String> collection = new ArrayList<>();

        //返回集合中元素的个数
        collection.size();

        //往集合中添加元素(单个元素添加)
        collection.add("Hello");
        //往集合中添加集合(多个元素添加)
        List<String> stringList = Arrays.asList("A", "B", "C");
        collection.addAll(stringList);

        //判断集合是否为空
        boolean empty = collection.isEmpty();

        //清空集合中的所有数据
        collection.clear();

        //查找当前集合中是否存在某个元素(单个查找) 根据equals()方法比较
        boolean ch = collection.contains("CH");
        //查找当前集合中是否存在某个集合中的所有元素(多个查找) 根据equals()方法比较
        boolean b = collection.containsAll(Arrays.asList(3, 4, 5, 6));

        //获得两个集合的交集(结果赋值给当前集合返回)
        collection.retainAll(Arrays.asList(3, 4, 5, 6));

        //删除集合中的第一次出现的某个元素, 删除成功返回true, 否则返回false
        collection.remove("AA");
        //删除当前集合中存在于指定集合中的所有元素 注意NULL值的处理 如果当前集合不允许null而指定集合有null
        collection.removeAll(Arrays.asList("AA", "BB"));

        //比较两个集合是否相等, 必须集合的大小相等且对应索引的元素也相等
        boolean equals = collection.equals(Arrays.asList("A", "B"));

        //获取集合的hashCode, 如果两个集合hashCode相同, 那么两个集合equals必须相等.
        int hashCode = collection.hashCode();

        //将集合转换为数组 返回值为Object[]
        Object[] objects = collection.toArray();
        //将集合转换为指定类型的数组
        String[] array = collection.toArray(new String[collection.size()]);

        //获取集合的迭代器, 不可以通过迭代器调用remove()方法;
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()){
            //iterator.remove();
            System.out.println(iterator.next());
        }
    }
}
