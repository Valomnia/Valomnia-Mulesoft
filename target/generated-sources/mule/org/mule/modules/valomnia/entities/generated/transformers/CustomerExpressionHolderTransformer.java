
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
import org.mule.modules.valomnia.entities.Customer;
import org.mule.modules.valomnia.entities.generated.holders.CustomerExpressionHolder;
import org.mule.transformer.types.DataTypeFactory;

@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.8.0", date = "2016-05-10T01:30:35+01:00", comments = "Build UNNAMED.2762.e3b1307")
public class CustomerExpressionHolderTransformer
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
        return (aClass == CustomerExpressionHolder.class);
    }

    public boolean isSourceDataTypeSupported(DataType<?> dataType) {
        return (dataType.getType() == CustomerExpressionHolder.class);
    }

    public List<Class<?>> getSourceTypes() {
        return Arrays.asList(new Class<?> [] {CustomerExpressionHolder.class });
    }

    public List<DataType<?>> getSourceDataTypes() {
        return Arrays.asList(new DataType<?> [] {DataTypeFactory.create(CustomerExpressionHolder.class)});
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
        return Customer.class;
    }

    public void setReturnDataType(DataType<?> type) {
        throw new UnsupportedOperationException();
    }

    public DataType<?> getReturnDataType() {
        return DataTypeFactory.create(Customer.class);
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
        CustomerExpressionHolder holder = ((CustomerExpressionHolder) src);
        Customer result = new Customer();
        try {
            final String _transformedPhone = ((String) evaluateAndTransform(this.muleContext, event, CustomerExpressionHolder.class.getDeclaredField("_phoneType").getGenericType(), null, holder.getPhone()));
            result.setPhone(_transformedPhone);
            final String _transformedMaxChequeValue = ((String) evaluateAndTransform(this.muleContext, event, CustomerExpressionHolder.class.getDeclaredField("_maxChequeValueType").getGenericType(), null, holder.getMaxChequeValue()));
            result.setMaxChequeValue(_transformedMaxChequeValue);
            final String _transformedInvoicesPerRoute = ((String) evaluateAndTransform(this.muleContext, event, CustomerExpressionHolder.class.getDeclaredField("_invoicesPerRouteType").getGenericType(), null, holder.getInvoicesPerRoute()));
            result.setInvoicesPerRoute(_transformedInvoicesPerRoute);
            final String _transformedCreditLimit = ((String) evaluateAndTransform(this.muleContext, event, CustomerExpressionHolder.class.getDeclaredField("_creditLimitType").getGenericType(), null, holder.getCreditLimit()));
            result.setCreditLimit(_transformedCreditLimit);
            final String _transformedIsCredit = ((String) evaluateAndTransform(this.muleContext, event, CustomerExpressionHolder.class.getDeclaredField("_isCreditType").getGenericType(), null, holder.getIsCredit()));
            result.setIsCredit(_transformedIsCredit);
            final String _transformedCity = ((String) evaluateAndTransform(this.muleContext, event, CustomerExpressionHolder.class.getDeclaredField("_cityType").getGenericType(), null, holder.getCity()));
            result.setCity(_transformedCity);
            final String _transformedBalance = ((String) evaluateAndTransform(this.muleContext, event, CustomerExpressionHolder.class.getDeclaredField("_balanceType").getGenericType(), null, holder.getBalance()));
            result.setBalance(_transformedBalance);
            final String _transformedOrganization = ((String) evaluateAndTransform(this.muleContext, event, CustomerExpressionHolder.class.getDeclaredField("_organizationType").getGenericType(), null, holder.getOrganization()));
            result.setOrganization(_transformedOrganization);
            final String _transformedPostalCode = ((String) evaluateAndTransform(this.muleContext, event, CustomerExpressionHolder.class.getDeclaredField("_postalCodeType").getGenericType(), null, holder.getPostalCode()));
            result.setPostalCode(_transformedPostalCode);
            final String _transformedName = ((String) evaluateAndTransform(this.muleContext, event, CustomerExpressionHolder.class.getDeclaredField("_nameType").getGenericType(), null, holder.getName()));
            result.setName(_transformedName);
            final String _transformedLongitude = ((String) evaluateAndTransform(this.muleContext, event, CustomerExpressionHolder.class.getDeclaredField("_longitudeType").getGenericType(), null, holder.getLongitude()));
            result.setLongitude(_transformedLongitude);
            final String _transformedCategoryReference = ((String) evaluateAndTransform(this.muleContext, event, CustomerExpressionHolder.class.getDeclaredField("_categoryReferenceType").getGenericType(), null, holder.getCategoryReference()));
            result.setCategoryReference(_transformedCategoryReference);
            final String _transformedLogo = ((String) evaluateAndTransform(this.muleContext, event, CustomerExpressionHolder.class.getDeclaredField("_logoType").getGenericType(), null, holder.getLogo()));
            result.setLogo(_transformedLogo);
            final String _transformedFax = ((String) evaluateAndTransform(this.muleContext, event, CustomerExpressionHolder.class.getDeclaredField("_faxType").getGenericType(), null, holder.getFax()));
            result.setFax(_transformedFax);
            final String _transformedWebsite = ((String) evaluateAndTransform(this.muleContext, event, CustomerExpressionHolder.class.getDeclaredField("_websiteType").getGenericType(), null, holder.getWebsite()));
            result.setWebsite(_transformedWebsite);
            final String _transformedLastUpdated = ((String) evaluateAndTransform(this.muleContext, event, CustomerExpressionHolder.class.getDeclaredField("_lastUpdatedType").getGenericType(), null, holder.getLastUpdated()));
            result.setLastUpdated(_transformedLastUpdated);
            final String _transformedMaxChequePeriod = ((String) evaluateAndTransform(this.muleContext, event, CustomerExpressionHolder.class.getDeclaredField("_maxChequePeriodType").getGenericType(), null, holder.getMaxChequePeriod()));
            result.setMaxChequePeriod(_transformedMaxChequePeriod);
            final String _transformedPaymentTerm = ((String) evaluateAndTransform(this.muleContext, event, CustomerExpressionHolder.class.getDeclaredField("_paymentTermType").getGenericType(), null, holder.getPaymentTerm()));
            result.setPaymentTerm(_transformedPaymentTerm);
            final String _transformedAppliedCashBackOutput = ((String) evaluateAndTransform(this.muleContext, event, CustomerExpressionHolder.class.getDeclaredField("_appliedCashBackOutputType").getGenericType(), null, holder.getAppliedCashBackOutput()));
            result.setAppliedCashBackOutput(_transformedAppliedCashBackOutput);
            final String _transformedReference = ((String) evaluateAndTransform(this.muleContext, event, CustomerExpressionHolder.class.getDeclaredField("_referenceType").getGenericType(), null, holder.getReference()));
            result.setReference(_transformedReference);
            final String _transformedBarecode = ((String) evaluateAndTransform(this.muleContext, event, CustomerExpressionHolder.class.getDeclaredField("_barecodeType").getGenericType(), null, holder.getBarecode()));
            result.setBarecode(_transformedBarecode);
            final String _transformedCountry = ((String) evaluateAndTransform(this.muleContext, event, CustomerExpressionHolder.class.getDeclaredField("_countryType").getGenericType(), null, holder.getCountry()));
            result.setCountry(_transformedCountry);
            final String _transformedIsActive = ((String) evaluateAndTransform(this.muleContext, event, CustomerExpressionHolder.class.getDeclaredField("_isActiveType").getGenericType(), null, holder.getIsActive()));
            result.setIsActive(_transformedIsActive);
            final String _transformedEmail = ((String) evaluateAndTransform(this.muleContext, event, CustomerExpressionHolder.class.getDeclaredField("_emailType").getGenericType(), null, holder.getEmail()));
            result.setEmail(_transformedEmail);
            final String _transformedAddress = ((String) evaluateAndTransform(this.muleContext, event, CustomerExpressionHolder.class.getDeclaredField("_addressType").getGenericType(), null, holder.getAddress()));
            result.setAddress(_transformedAddress);
            final String _transformedDateCreated = ((String) evaluateAndTransform(this.muleContext, event, CustomerExpressionHolder.class.getDeclaredField("_dateCreatedType").getGenericType(), null, holder.getDateCreated()));
            result.setDateCreated(_transformedDateCreated);
            final String _transformedUserReference = ((String) evaluateAndTransform(this.muleContext, event, CustomerExpressionHolder.class.getDeclaredField("_userReferenceType").getGenericType(), null, holder.getUserReference()));
            result.setUserReference(_transformedUserReference);
            final String _transformedLatitude = ((String) evaluateAndTransform(this.muleContext, event, CustomerExpressionHolder.class.getDeclaredField("_latitudeType").getGenericType(), null, holder.getLatitude()));
            result.setLatitude(_transformedLatitude);
            final String _transformedComment = ((String) evaluateAndTransform(this.muleContext, event, CustomerExpressionHolder.class.getDeclaredField("_commentType").getGenericType(), null, holder.getComment()));
            result.setComment(_transformedComment);
            final String _transformedReturnDiscount = ((String) evaluateAndTransform(this.muleContext, event, CustomerExpressionHolder.class.getDeclaredField("_returnDiscountType").getGenericType(), null, holder.getReturnDiscount()));
            result.setReturnDiscount(_transformedReturnDiscount);
            final String _transformedMobile = ((String) evaluateAndTransform(this.muleContext, event, CustomerExpressionHolder.class.getDeclaredField("_mobileType").getGenericType(), null, holder.getMobile()));
            result.setMobile(_transformedMobile);
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
