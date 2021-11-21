原型（Prototype）模式的定义如下：

用一个已经创建的实例作为原型，通过复制该原型对象来创建一个和原型相同或相似的新对象

优点：
Java 自带的原型模式基于内存二进制流的复制，在性能上比直接 new 一个对象更加优良。
可以使用深克隆方式保存对象的状态，使用原型模式将对象复制一份，并将其状态保存起来，简化了创建对象的过程，以便在需要的时候使用（例如恢复到历史某一状态），可辅助实现撤销操作。

缺点：
需要为每一个类都配置一个 clone 方法
clone 方法位于类的内部，当对已有类进行改造的时候，需要修改代码，违背了开闭原则。
当实现深克隆时，需要编写较为复杂的代码，而且当对象之间