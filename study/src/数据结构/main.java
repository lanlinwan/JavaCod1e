package 数据结构;

public class main {
    /**
       栈:后进先出,先进后出

       队列:先进先出,后进后出

      数组:是一种查询快，增删慢的模型
      查询速度快:查询数据通过地址值和索引定位,查询任意数据耗时相同。(元素在 内存中是连续存储的)
      删除效率低:要将原始数据删除，同时后面每个数据前移。
      添加效率极低:添加位置后的每个数据后移，再添加元素。


     链表:
     链表中的结点是独立的对象，在内存中是不连续的，每个结点包含数据值和下一个结点的地址。
     链表查询慢,无论查询哪个数据都要从头开始找。
     链表增删相对快



     树:每一个节点



      平衡二叉树:任意节点左右子树高度不超过1
      如何保持平衡:左旋 与 右旋,触发机制:当添加一个节点之后,该树不再是一颗平衡二叉树
      1.左旋:从添加的节点开始,不断的往父节点找不平衡的点
      步骤:(不平衡的的点没有左子节点)以不平衡的的点作为支点,把支点左旋降级,变为左子节点,晋升原来的右子节点
          (不平衡的的点有左子节点)以不平衡的点作为支点将根节点的右侧往左拉,原先的右子节点变成新的父节点，并把多余的左子节点出让，给已经降级的根节点当右子节点

     */
}
