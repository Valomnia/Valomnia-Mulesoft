
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
import org.mule.modules.valomnia.entities.Tax;
import org.mule.modules.valomnia.entities.generated.holders.TaxExpressionHolder;
import org.mule.transformer.types.DataTypeFactory;

@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.8.0", date = "2016-05-10T10:57:41+01:00", comments = "Build UNNAMED.2762.e3b1307")
public class TaxExpressionHolderTransformer
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
        return (aClass == TaxExpressionHolder.class);
    }

    public boolean isSourceDataTypeSupported(DataType<?> dataType) {
        return (dataType.getType() == TaxExpressionHolder.class);
    }

    public List<Class<?>> getSourceTypes() {
        return Arrays.asList(new Class<?> [] {TaxExpressionHolder.class });
    }

    public List<DataType<?>> getSourceDataTypes() {
        return Arrays.asList(new DataType<?> [] {DataTypeFactory.create(TaxExpressionHolder.class)});
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
        return Tax.class;
    }

    public void setReturnDataType(DataType<?> type) {
        throw new UnsupportedOperationException();
    }

    public DataType<?> getReturnDataType() {
        return DataTypeFactory.create(Tax.class);
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
        TaxExpressionHolder holder = ((TaxExpressionHolder) src);
        Tax result = new Tax();
        try {
            final String _transformedId = ((String) evaluateAndTransform(this.muleContext, event, TaxExpressionHolder.class.getDeclaredField("_idType").getGenericType(), null, holder.getId()));
            result.setId(_transformedId);
            final String _transformedOrganization = ((String) evaluateAndTransform(this.muleContext, event, TaxExpressionHolder.class.getDeclaredField("_organizationType").getGenericType(), null, holder.getOrganization()));
            result.setOrganization(_transformedOrganization);
            final String _transformedItemReference = ((String) evaluateAndTransform(this.muleContext, event, TaxExpressionHolder.class.getDeclaredField("_itemReferenceType").getGenericType(), null, holder.getItemReference()));
            result.setItemReference(_transformedItemReference);
            final String _transformedLastUpdated = ((String) evaluateAndTransform(this.muleContext, event, TaxExpressionHolder.class.getDeclaredField("_lastUpdatedType").getGenericType(), null, holder.getLastUpdated()));
            result.setLastUpdated(_transformedLastUpdated);
            final String _transformedDateCreated = ((String) evaluateAndTransform(this.muleContext, event, TaxExpressionHolder.class.getDeclaredField("_dateCreatedType").getGenericType(), null, holder.getDateCreated()));
            result.setDateCreated(_transformedDateCreated);
            final String _transformedTaxValue = ((String) evaluateAndTransform(this.muleContext, event, TaxExpressionHolder.class.getDeclaredField("_taxValueType").getGenericType(), null, holder.getTaxValue()));
            result.setTaxValue(_transformedTaxValue);
            final String _transformedTaxListName = ((String) evaluateAndTransform(this.muleContext, event, TaxExpressionHolder.class.getDeclaredField("_taxListNameType").getGenericType(), null, holder.getTaxListName()));
            result.setTaxListName(_transformedTaxListName);
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
