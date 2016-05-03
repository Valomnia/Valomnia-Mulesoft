Anypoint PayPal Connector Demo
==================================


INTRODUCTION
------------
The PayPal demo consists of the following projects:

* example-getbalance-getpaldetails - Provides sample flows on how to make use of various operations supported by the connector using the DataWeave (Data Framework Language). Most of the flows are developed based on the combination of related operations to make a logical outcome.

HOW TO RUN DEMO
---------------

### Prerequisites
In order to build and run this project, you'll need;

* Anypoint Studio with Mule ESB 3.7 Runtime.
* Anypoint PayPal v3.0.0
* Access to a PayPal developer account

### Test the flows

With Anypoint Studio up and running, open the Import wizard from the File menu. A pop-up wizard will offer you the chance to pick Anypoint Studio Project from External Location. On the next wizard window point Project Root to the location of the demo project and select the Server Runtime as Mule Server 3.7.0 CE or EE. Once successfully imported the studio will automatically present the Anypoint Flows.

From the Package Explorer view, expand the demo project and open the mule-app.properties file. Fill in the credentials of PayPal developer account. Note that the connector only works with API Signature as authentication mechanism, so please ensure to enable API signature in PayPal developer dashboard. 

#### paypal-operations-demo :

* Run the demo project.
* In web browser visit http://localhost:8081/paypal to view the demo page. The page displays the operations along with respective variables required to invoke the operation defined by the flows.

While the demo project is up and running you can also directly visit the below URL's to view the output of individual flows.

* Get Balance : http://localhost:8081/paypal/getbalance?version=51
* Get Pal Details : http://localhost:8081/paypal/getpaldetails?version=51

SUMMARY
-------

Congratulations! The demo presents only a limited list of operations to play with, refer to the connector user manual for all the operations supported and further possibilities.