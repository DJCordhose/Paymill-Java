/**
 * 
 */
package de.paymill.service;

import java.util.HashMap;
import java.util.Map;

import de.paymill.model.Payment;
import de.paymill.net.HttpClient;

/**
 * @author jk
 * 
 */
public class PaymentService extends AbstractService<Payment> {

	public PaymentService() {
		super("payments", Payment.class);
	}

	public PaymentService(HttpClient client) {
		super("payments", Payment.class, client);
	}

	public Payment create(String token) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("token", token);
		return client.post(resource, params, modelClass);
	}

}
