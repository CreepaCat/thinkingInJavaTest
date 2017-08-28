package interfaces02;
import interfaces02.filter.Filter;
import interfaces02.filter.Waveform;

//适配器,将filter接口与processor接口匹配
//适配器本身是Processor,但内部可接受Filter，所以看起来像进行了转换
public class FilterAdapter02 implements Processor {
    private Filter filter;
    public FilterAdapter02(Filter filter){
        this.filter = filter;//代理
    }
    @Override
    public String name() {
        return filter.name();
    }
    @Override
    public Waveform process(Object input) {
        return filter.process((Waveform) input);
    }
}
