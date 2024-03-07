###桥接模式经典例子
**人话就是**如果你有3支不同笔尖的画笔，12种颜料，那么可以画出3 * 12种线条；而蜡笔想要做到同样的效果就需要36只。

前面的画笔就是桥接模式（笔不同型号是一个变化维度，不同颜色的颜料是一个变化维度，两个维度不相互影响），而后面的画笔就是多重继承（笔型号和颜料一起影响蜡笔）。理解以后我们将其抽象成代码描述：

pen类是一个抽象类，里面有一个方法draw()。我们想要使用画笔，则需要放入一种颜色，然后执行draw方法将这种颜色画出来。

    public abstract class Pen {
        public abstract void draw(Color color);
    }

我们可以继承pen这个抽象类，来实现多种不同型号的笔。

    public class PenOne extends Pen {
        public void draw(Color color) {
        System.out.println("当前一号笔在使用" + color.use() + "画画");    
        }
    }
    public class PenTwo extends Pen {
        public void draw(Color color) {
        System.out.println("当前二号笔在使用" + color.use() + "画画");    
        }
    }
color是一个接口，实现类有red，blue等等若干。

    public interface Color {
        public String use();
    }
    public class Blue implements Color {
        public String use() {
            return "蓝色";
        }
    }
    public class Red implements Color {
        public String use() {
            return "红色";
        }
    }
然后我们就可以画画了：

    public class User {
        public static void main(String[] args) {
            Pen pen = new PenOne();        
            pen.draw(new Red());
        }
    }
输出结果：当前一号笔在使用红色画画

这时我们拓展一种型号的画笔只需要新增一个Pen的实现类即可，颜料盒类不受影响；同理拓展颜料的数量，画笔不受影响。
