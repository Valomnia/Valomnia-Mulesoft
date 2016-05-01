package test;



import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractMessageTransformer;
import org.mule.api.MuleMessage;


public class ItemTransformer extends AbstractMessageTransformer

{

    @Override
    public Object transformMessage(MuleMessage message, String outputEncoding) throws TransformerException {
        Item item = new Item();
        item.setName("ItemTest");
        item.setReference("It002");
        item.setDescription("Item for test");

        return item;
    }
}
