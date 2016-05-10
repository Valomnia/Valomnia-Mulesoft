
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
import org.mule.modules.valomnia.entities.Contact;
import org.mule.modules.valomnia.entities.generated.holders.ContactExpressionHolder;
import org.mule.transformer.types.DataTypeFactory;

@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.8.0", date = "2016-05-10T10:57:41+01:00", comments = "Build UNNAMED.2762.e3b1307")
public class ContactExpressionHolderTransformer
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
        return (aClass == ContactExpressionHolder.class);
    }

    public boolean isSourceDataTypeSupported(DataType<?> dataType) {
        return (dataType.getType() == ContactExpressionHolder.class);
    }

    public List<Class<?>> getSourceTypes() {
        return Arrays.asList(new Class<?> [] {ContactExpressionHolder.class });
    }

    public List<DataType<?>> getSourceDataTypes() {
        return Arrays.asList(new DataType<?> [] {DataTypeFactory.create(ContactExpressionHolder.class)});
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
        return Contact.class;
    }

    public void setReturnDataType(DataType<?> type) {
        throw new UnsupportedOperationException();
    }

    public DataType<?> getReturnDataType() {
        return DataTypeFactory.create(Contact.class);
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
        ContactExpressionHolder holder = ((ContactExpressionHolder) src);
        Contact result = new Contact();
        try {
            final String _transformedLastName = ((String) evaluateAndTransform(this.muleContext, event, ContactExpressionHolder.class.getDeclaredField("_lastNameType").getGenericType(), null, holder.getLastName()));
            result.setLastName(_transformedLastName);
            final String _transformedPhone = ((String) evaluateAndTransform(this.muleContext, event, ContactExpressionHolder.class.getDeclaredField("_phoneType").getGenericType(), null, holder.getPhone()));
            result.setPhone(_transformedPhone);
            final String _transformedFax = ((String) evaluateAndTransform(this.muleContext, event, ContactExpressionHolder.class.getDeclaredField("_faxType").getGenericType(), null, holder.getFax()));
            result.setFax(_transformedFax);
            final String _transformedLastUpdated = ((String) evaluateAndTransform(this.muleContext, event, ContactExpressionHolder.class.getDeclaredField("_lastUpdatedType").getGenericType(), null, holder.getLastUpdated()));
            result.setLastUpdated(_transformedLastUpdated);
            final String _transformedPhone2 = ((String) evaluateAndTransform(this.muleContext, event, ContactExpressionHolder.class.getDeclaredField("_phone2Type").getGenericType(), null, holder.getPhone2()));
            result.setPhone2(_transformedPhone2);
            final String _transformedPhoto = ((String) evaluateAndTransform(this.muleContext, event, ContactExpressionHolder.class.getDeclaredField("_photoType").getGenericType(), null, holder.getPhoto()));
            result.setPhoto(_transformedPhoto);
            final String _transformedCustomerReference = ((String) evaluateAndTransform(this.muleContext, event, ContactExpressionHolder.class.getDeclaredField("_customerReferenceType").getGenericType(), null, holder.getCustomerReference()));
            result.setCustomerReference(_transformedCustomerReference);
            final String _transformedCity = ((String) evaluateAndTransform(this.muleContext, event, ContactExpressionHolder.class.getDeclaredField("_cityType").getGenericType(), null, holder.getCity()));
            result.setCity(_transformedCity);
            final String _transformedCountry = ((String) evaluateAndTransform(this.muleContext, event, ContactExpressionHolder.class.getDeclaredField("_countryType").getGenericType(), null, holder.getCountry()));
            result.setCountry(_transformedCountry);
            final String _transformedId = ((String) evaluateAndTransform(this.muleContext, event, ContactExpressionHolder.class.getDeclaredField("_idType").getGenericType(), null, holder.getId()));
            result.setId(_transformedId);
            final String _transformedOrganization = ((String) evaluateAndTransform(this.muleContext, event, ContactExpressionHolder.class.getDeclaredField("_organizationType").getGenericType(), null, holder.getOrganization()));
            result.setOrganization(_transformedOrganization);
            final String _transformedPostalCode = ((String) evaluateAndTransform(this.muleContext, event, ContactExpressionHolder.class.getDeclaredField("_postalCodeType").getGenericType(), null, holder.getPostalCode()));
            result.setPostalCode(_transformedPostalCode);
            final String _transformedAddress = ((String) evaluateAndTransform(this.muleContext, event, ContactExpressionHolder.class.getDeclaredField("_addressType").getGenericType(), null, holder.getAddress()));
            result.setAddress(_transformedAddress);
            final String _transformedEmail = ((String) evaluateAndTransform(this.muleContext, event, ContactExpressionHolder.class.getDeclaredField("_emailType").getGenericType(), null, holder.getEmail()));
            result.setEmail(_transformedEmail);
            final String _transformedDateCreated = ((String) evaluateAndTransform(this.muleContext, event, ContactExpressionHolder.class.getDeclaredField("_dateCreatedType").getGenericType(), null, holder.getDateCreated()));
            result.setDateCreated(_transformedDateCreated);
            final String _transformedUserReference = ((String) evaluateAndTransform(this.muleContext, event, ContactExpressionHolder.class.getDeclaredField("_userReferenceType").getGenericType(), null, holder.getUserReference()));
            result.setUserReference(_transformedUserReference);
            final String _transformedFonction = ((String) evaluateAndTransform(this.muleContext, event, ContactExpressionHolder.class.getDeclaredField("_fonctionType").getGenericType(), null, holder.getFonction()));
            result.setFonction(_transformedFonction);
            final String _transformedFirstName = ((String) evaluateAndTransform(this.muleContext, event, ContactExpressionHolder.class.getDeclaredField("_firstNameType").getGenericType(), null, holder.getFirstName()));
            result.setFirstName(_transformedFirstName);
            final String _transformedComment = ((String) evaluateAndTransform(this.muleContext, event, ContactExpressionHolder.class.getDeclaredField("_commentType").getGenericType(), null, holder.getComment()));
            result.setComment(_transformedComment);
            final String _transformedMobile = ((String) evaluateAndTransform(this.muleContext, event, ContactExpressionHolder.class.getDeclaredField("_mobileType").getGenericType(), null, holder.getMobile()));
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
