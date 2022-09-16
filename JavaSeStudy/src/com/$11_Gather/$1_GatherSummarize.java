package com.$11_Gather;

/*
    集合概述:
        是Java中存储对象数据的一种容器, 结合中存储的是对象的地址
        集合特点:
            1. 大小不固定, 启动后可以动态变化, 类型也可以选择不固定
            2. 集合非常适合做元素的增删操作
            注意:集合中只能存储引用数据类型, 要存储基数据类型要使用包装类
        集合适合的场景:
            数据的个数不确定, 需要进行元素的增删操作
        数组与集合的区别:
            1. 存储元素个数:
                1.1 数组定义后类型确定, 元素个数确定
                1.2 集合类型可以不固定, 大小可变
            2. 存储元素类型:
                2.1 数组可以存储基本类型和引用类型的数据
                2.2 集合只能存储引用数据类型
            3. 适合的场景:
                3.1 数组适合做数据个数和类型确定的场景
                3.2 集合适合做数据个数不确定, 且需要做增删元素的场景
        集合对泛型的支持:
            集合都是支持泛型的, 可以在编译阶段约束集合只能操作某种数据类型
                例: Collection<String> lists = new ArrayList<String>();
                      Collection<String> lists = new ArrayList();
                注意:集合和泛型都只能支持引用数据类型, 不支持基本数据类型, 集合中存储的元素都认为是对象
        集合类体系结构:
            1.Collection接口单列集合:每个元素只包含一个值
                Collection集合常用方法:
                    1. public boolean add(E e):把给定的对象添加到当前集合中
                    2. public void clear() : 清空集合中的元素
                    3. public boolean remove(E e): 把给定的对象在当前集合中删除
                    4. public boolean contains(Object obj): 判断当前集合是否包含给定的对象
                    5. public boolean isEmpty(): 判断当前集合否为空
                    6. public int size():返回集合中元素的个数
                    7. public Object[] toArray():把集合中的元素存储到数组中
                Collection集合遍历方式:
                        遍历:指一个一个的把容器中的元素访问一遍
                        1. 迭代器遍历:
                            迭代器在Java中的代表是Iterator, 迭代器是集合的专用遍历方式
                            Collection集合获取迭代器:
                                Iterator<E> iterator(): 返回集合中的迭代器对象, 该迭代器对象默认指向当前集合的0索引
                                Iterator中的常用方法:
                                boolean hasNext(): 询问当前位置是否有元素存在, 存在返回true, 不存在返回false
                                E next(): 获取当前位置的元素, 并同时将迭代器对象移向下一个位置, 注意防止取出越界
                                              取出元素越界会报NoSuchElementException异常
                                remove():可以删除集合中当前位置的元素, 并且不会出现bug
                        2. 增强for循环遍历:
                            既可以遍历集合, 又可以遍历数组, 其内部原理是一个Iterator迭代器, 遍历集合 相当于是迭代器的简化写法
                            实现Iterable接口的类才可以使用迭代器和增强for, Collection接口已经实现了Iterable接口
                            格式:
                                for(元素数据类型 变量名: 数组或者Collection集合) {
                                    // 在此处使用变量即可, 该变量就是元素
                                }
                        3. lambda表达式遍历:
                            方法:
                                default void forEach(Consumer <? super T > action):结合lambda遍历
            Collection集合分类:
                List系列集合:添加的元素是有序的, 可重复, 有索引
                    有序:存储和取出元素的顺序一致
                    可重复:存储的元素可以重复
                    有索引:可以通过索引操作元素
                    常用方法:
                        1. void add(int index, E element): 在此集合中的指定位置插入指定的元素
                        2. E remove(int index): 删除指定索引处的元素, 返回被删除的元素
                        3. E set(int index, E element): 修改指定索引处的元素, 返回被修改的元素
                        4. E get(int index): 返回指定索引处的元素
                    List集合两个实现类:
                        1:ArrayList:底层是基于数组实现的, 查询元素快, 增删相对慢
                            ArrayList第一次创建集合并添加第一个元素的时候, 在底层会创建一个默认长度为10的数组,
                            当元素超过集合容量时, 会按照原来容量的1.5倍对集合进行扩容
                        2:LinkedList:底层给予双链表实现的, 查询元素慢, 增删首尾元素非常快
                            LinkedList集合特有功能:
                                1. public void addFirst(E e): 在该列表开头插入指定的元素
                                2. public void assLast(E e):将指定的元素追加到此列表的末尾
                                3. public E getFirst(): 返回此列表的第一个元素
                                4. public E getLast(): 返回此列表的最后一个元素
                                5. public E removeFirst(): 从此列表中删除并返回第一个元素
                                6. public E removeLast(): 从此列表中删除并返回最后一个元素
                Set系列集合:添加的元素是无序的, 不重复, 无索引
                    无序:存取顺序不一致
                    不重复:添加数据时可以去重
                    无索引:没有带索引的方法, 不能使用普通for循环遍历, 也不能通过索引来获取元素
                    1. HashSet:无序的, 不重复, 无索引
                        无序的底层原理:
                            集合底层采取哈希表存储数据
                          哈希表:一种对于增删改查数据性能都较好的的结构
                                组成:
                                    JDK8之前:底层使用数组+链表组成, 结合哈希算法
                                    JDK8开始后:底层采用数组+链表+红黑树组成
                            哈希值:指JDK根据对象的地址, 按照某种规则算出来的int类型的数值
                                public int hashCode():返回对象的哈希值
                                对象的哈希值特点:
                                    1. 同一个对象多次调用hashCode()方法返回的哈希值是相同的
                                    2. 默认情况下, 不同对象的哈希值不同
                    2. LinkedHashSet:属于HashSet的子类, 有序, 不重复, 无索引
                        有序:保证存储和取出的元素顺序一致
                        原理:
                            底层结构依然是哈希表, 只是每个元素又额外的多了一个双链表的机制记录存储顺序
                    3. TreeSet:可排序, 不重复, 无索引
                        可排序:按照元素的大小默认升序(从小到大)排序
                        集合底层基于红黑树的数据结构实现排序, 增删改查性能都较好
                        注意:TreeSet集合是一定要排序的, 可以将元素按照指定的规则进行排序
                        默认规则:
                            1. 对于数值类型: Integer, Double等, 官方默认按照大小进行升序排序
                            2. 对于字符串类型: 默认按照首字符的编号进行升序排序
                            3. 对于自定义类型如Student对象, TreeSet集合无法直接排序, 需要制定排序规则
                                自定义比较规则:
                                    1. 让自定义的类实现Comparable接口重写里面的compareTo方法来定制比较规则
                                    2. TreeSet集合有参构造器, 可以设置Comparator接口对应的比较器对象, 来定制比较规则
                                  当两种比较规则均存在时, 默认使用集合自定义比较规则
                  Collection集合总结:
                    1.希望元素可以重复, 又有索引, 索引查询要快:
                        使用ArrayList集合, 底层基于数组, 使用最多的集合
                    2.希望元素可以重复, 有索引, 增删首尾操作快:
                        使用LinkedList集合, 底层基于双链表
                    3. 希望增删改查都快, 但是元素不重复, 无索引, 无序:
                        使用HashSet集合, 底层基于哈希表
                    4. 希望增删改查都快, 但是元素不重复, 无索引, 有序:
                        使用LinkedHashSet集合, 底层基于哈希表和双链表
                    5. 要对对象进行排序:
                        使用TreeSet集合, 底层基于红黑树, 后续也可以使用List集合实现排序

            集合工具类:
                Collections:不属于集合, 是用来操作集合的工具类
                常用方法:
                    1. public static <T> boolean addAll(Collection<? super T> c, T...elements): 给集合对象批量添加元素
                    2. public static <T> void sort(List<T> list): 将集合中元素按照默认规则排序, 只能排序具有值特性的元素
                                                                                    该方式不可以直接对自定义类型的List集合排序, 需要自定义类
                                                                                    实现比较规则Comparable接口
                    3. public static void shuffle(List<?> list): 打乱集合顺序
                    4. public static <T> void sort(List<T> list, Comparator<? super T> c):将集合中元素按照指定规则排序
            2.Map泛型接口双列集合:每个元素包含两个值(键值对), 也被称为键值对集合
                集合元素格式:key = value (键值对元素)
                集合格式: {key1 = value1, key2 = value2, key3 = value3, ....}
                集合特点:
                    Map集合特点由键决定
                    键:无序, 不重复, 无索引
                    值:不做要求, 可以重复
                    1. Map集合后面重复的键对应的值会覆盖前面重复的键的值
                    2. Map集合的键值对都可以为null
                Map集合实现类特点:
                    HashMap: 与Map体系一致, 是使用最多的Map集合
                        键:无序, 不重复, 无索引
                        值:不做要求
                        底层原理:哈希表结构, 与HashSet集合一致, 只是HashMap集合每个元素包含两个值
                                        实际上, Set系列集合底层就是通过Map集合实现的, 但Set集合中只要键数据, 不要值数据
                                        HashMap集合也是依赖hashCode方法和equals方法保证键的唯一性
                        重写hashCode和equals方法:如果键要存储自定义类型对象, 需要重写hashCode和equals方法
                        基于哈希表, 增删改查性能好
                    LinkedHashMap:
                        键:有序, 不重复, 无索引
                            有序:保证存储和取出元素的顺序一致
                        值:不做要求
                        底层原理:基于哈希表的基础上, 每个键值对元素额外多了一个双链表机制记录元素存储的顺序
                    TreeMap:
                        键:按照键是可排序, 不重复, 无索引
                            可排序:按照键数据的大小进行默认升序(由小到大)排序, 只能对键排序
                            注意:TreeMap集合一定要进行排序, 可以默认排序, 也可以将键按照指定的规则进行排序
                            默认排序规则:
                            1. 对于数值类型: Integer, Double等, 官方默认按照大小进行升序排序
                            2. 对于字符串类型: 默认按照首字符的编号进行升序排序
                            3. 对于自定义类型如Student对象, TreeSet集合无法直接排序, 需要制定排序规则
                                自定义比较规则:
                                    1. 让自定义的类实现Comparable接口重写里面的compareTo方法来定制比较规则
                                    2. TreeSet集合有参构造器, 可以设置Comparator接口对应的比较器对象, 来定制比较规则
                                  当两种比较规则均存在时, 默认使用集合自定义比较规则
                        值:不做要求
                        底层原理:与TreeSet集合底层原理一致,基于红黑树的数据结构实现排序, 增删改查性能都较好
                Map集合常用方法:
                    1. V put(K key, V value): 添加元素
                    2. V remove(Object key): 根据键删除键值对元素
                    3. void clear(): 移除所有的键值对元素
                    4. boolean containsKey(Object key): 判断集合是否包含指定的键
                    5. boolean containsValue(Object value): 判断集合是否包含指定的值
                    6. boolean isEmpty(): 判断集合是否为空
                    7. int size(): 返回集合的长度, 指集合中键值对的个数
                    8. map1.putAll(map2): 将map2集合的元素拷贝一份到集合map1中(重复的键会修改值)
                Map集合遍历:
                    方式一:键找值
                        Set<K> keySet(): 获取所有键的集合
                        V get(Object key): 根据键获取值
                        1. 先获取Map集合的全部键的Set集合
                        2. 遍历键的Set集合, 通过键提取对应的值
                    方式二:键值对
                        Set<Map.Entry<K, V>> entrySet():获取所有键值对对象的集合
                        K getKey(): 获取键
                        V getValue():获取值
                        1. 先把Map集合转换成Set集合, Set集合中每个元素都是键值对的实体类型(即将键和值整体看做一个对象)
                        2. 遍历Set集合, 然后提取键以及提取值
                    方式三:lambda表达式
                        default void forEach(BiConsumer <? super K, ? super V> action):结合lambda遍历Map集合
            集合嵌套:
                一种集合作为另一种集合的元素存在于另一个集合中
 */

public class $1_GatherSummarize {
}
