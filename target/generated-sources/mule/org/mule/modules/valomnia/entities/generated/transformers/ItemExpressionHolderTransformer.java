
package org.mule.modules.valomnia.entities.generated.transformers;

import java.util.Arrays;
import java.util.List;
import javax.annotation.Generated;
import org.mule.api.MuleContext;
import org.mule.api.MuleEvent;
import org.mule.api.endpoint.ImmutableEndpoint;
import org.mule.api.lifecycle.InitialisationException;
import org.mule.api.transformer.DataType;
import org.mule.api.transformer.DiscoverableTransformer;
import org.mule.api.transformer.MessageTransformer;
import org.mule.api.transformer.TransformerException;
import org.mule.api.transformer.TransformerMessagingException;
import org.mule.config.i18n.CoreMessages;
import org.mule.devkit.processor.ExpressionEvaluatorSupport;
import org.mule.modules.valomnia.entities.Item;
import org.mule.modules.valomnia.entities.generated.holders.ItemExpressionHolder;
import org.mule.transformer.types.DataTypeFactory;

@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.8.0", date = "2016-05-10T10:57:41+01:00", comments = "Build UNNAMED.2762.e3b1307")
public class ItemExpressionHolderTransformer
    extends ExpressionEvaluatorSupport
    implements DiscoverableTransformer, MessageTransformer
{

    private int weighting = DiscoverableTransformer.DEFAULT_PRIORITY_WEIGHTING;
    private ImmutableEndpoint endpoint;
    private MuleContext muleContext;
    private String name;

    public int getPriorityWeighting() {
        return weighting;
    }

    public void setPriorityWeighting(int weighting) {
        this.weighting = weighting;
    }

    public boolean isSourceTypeSupported(Class<?> aClass) {
        return (aClass == ItemExpressionHolder.class);
    }

    public boolean isSourceDataTypeSupported(DataType<?> dataType) {
        return (dataType.getType() == ItemExpressionHolder.class);
    }

    public List<Class<?>> getSourceTypes() {
        return Arrays.asList(new Class<?> [] {ItemExpressionHolder.class });
    }

    public List<DataType<?>> getSourceDataTypes() {
        return Arrays.asList(new DataType<?> [] {DataTypeFactory.create(ItemExpressionHolder.class)});
    }

    public boolean isAcceptNull() {
        return false;
    }

    public boolean isIgnoreBadInput() {
        return false;
    }

    public Object transform(Object src)
        throws TransformerException
    {
        throw new UnsupportedOperationException();
    }

    public Object transform(Object src, String encoding)
        throws TransformerException
    {
        throw new UnsupportedOperationException();
    }

    public void setReturnClass(Class<?> theClass) {
        throw new UnsupportedOperationException();
    }

    public Class<?> getReturnClass() {
        return Item.class;
    }

    public void setReturnDataType(DataType<?> type) {
        throw new UnsupportedOperationException();
    }

    public DataType<?> getReturnDataType() {
        return DataTypeFactory.create(Item.class);
    }

    public void setEndpoint(ImmutableEndpoint ep) {
        endpoint = ep;
    }

    public ImmutableEndpoint getEndpoint() {
        return endpoint;
    }

    public void dispose() {
    }

    public void initialise()
        throws InitialisationException
    {
    }

    public void setMuleContext(MuleContext context) {
        muleContext = context;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    public Object transform(Object src, MuleEvent event)
        throws TransformerMessagingException
    {
        return transform(src, null, event);
    }

    public Object transform(Object src, String encoding, MuleEvent event)
        throws TransformerMessagingException
    {
        if (src == null) {
            return null;
        }
        ItemExpressionHolder holder = ((ItemExpressionHolder) src);
        Item result = new Item();
        try {
            final Integer _transformedId = ((Integer) evaluateAndTransform(this.muleContext, event, ItemExpressionHolder.class.getDeclaredField("_idType").getGenericType(), null, holder.getId()));
            result.setId(_transformedId);
            final String _transformedReference = ((String) evaluateAndTransform(this.muleContext, event, ItemExpressionHolder.class.getDeclaredField("_referenceType").getGenericType(), null, holder.getReference()));
            result.setReference(_transformedReference);
            final String _transformedOrganization = ((String) evaluateAndTransform(this.muleContext, event, ItemExpressionHolder.class.getDeclaredField("_organizationType").getGenericType(), null, holder.getOrganization()));
            result.setOrganization(_transformedOrganization);
            final String _transformedName = ((String) evaluateAndTransform(this.muleContext, event, ItemExpressionHolder.class.getDeclaredField("_nameType").getGenericType(), null, holder.getName()));
            result.setName(_transformedName);
            final String _transformedParentReference = ((String) evaluateAndTransform(this.muleContext, event, ItemExpressionHolder.class.getDeclaredField("_parentReferenceType").getGenericType(), null, holder.getParentReference()));
            result.setParentReference(_transformedParentReference);
            final String _transformedCategoryReference = ((String) evaluateAndTransform(this.muleContext, event, ItemExpressionHolder.class.getDeclaredField("_categoryReferenceType").getGenericType(), null, holder.getCategoryReference()));
            result.setCategoryReference(_transformedCategoryReference);
            final String _transformedDescription = ((String) evaluateAndTransform(this.muleContext, event, ItemExpressionHolder.class.getDeclaredField("_descriptionType").getGenericType(), null, holder.getDescription()));
            result.setDescription(_transformedDescription);
            final String _transformedDisplayOrder = ((String) evaluateAndTransform(this.muleContext, event, ItemExpressionHolder.class.getDeclaredField("_displayOrderType").getGenericType(), null, holder.getDisplayOrder()));
            result.setDisplayOrder(_transformedDisplayOrder);
            final String _transformedIsActive = ((String) evaluateAndTransform(this.muleContext, event, ItemExpressionHolder.class.getDeclaredField("_isActiveType").getGenericType(), null, holder.getIsActive()));
            result.setIsActive(_transformedIsActive);
            final String _transformedImage1 = ((String) evaluateAndTransform(this.muleContext, event, ItemExpressionHolder.class.getDeclaredField("_image1Type").getGenericType(), null, holder.getImage1()));
            result.setImage1(_transformedImage1);
            final String _transformedImage2 = ((String) evaluateAndTransform(this.muleContext, event, ItemExpressionHolder.class.getDeclaredField("_image2Type").getGenericType(), null, holder.getImage2()));
            result.setImage2(_transformedImage2);
            final String _transformedImage3 = ((String) evaluateAndTransform(this.muleContext, event, ItemExpressionHolder.class.getDeclaredField("_image3Type").getGenericType(), null, holder.getImage3()));
            result.setImage3(_transformedImage3);
            final String _transformedDateCreated = ((String) evaluateAndTransform(this.muleContext, event, ItemExpressionHolder.class.getDeclaredField("_dateCreatedType").getGenericType(), null, holder.getDateCreated()));
            result.setDateCreated(_transformedDateCreated);
            final String _transformedLastUpdated = ((String) evaluateAndTransform(this.muleContext, event, ItemExpressionHolder.class.getDeclaredField("_lastUpdatedType").getGenericType(), null, holder.getLastUpdated()));
            result.setLastUpdated(_transformedLastUpdated);
        } catch (NoSuchFieldException e) {
            throw new TransformerMessagingException(CoreMessages.createStaticMessage("internal error"), event, this, e);
        } catch (TransformerException e) {
            throw new TransformerMessagingException(e.getI18nMessage(), event, this, e);
        }
        return result;
    }

    public MuleEvent process(MuleEvent event) {
        return null;
    }

    public String getMimeType() {
        return null;
    }

    public String getEncoding() {
        return null;
    }

    public MuleContext getMuleContext() {
        return muleContext;
    }

}
