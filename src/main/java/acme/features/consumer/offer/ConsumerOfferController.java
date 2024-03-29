
package acme.features.consumer.offer;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import acme.components.CustomCommand;
import acme.entities.offers.Offer;
import acme.entities.roles.Consumer;
import acme.framework.components.BasicCommand;
import acme.framework.controllers.AbstractController;

@Controller
@RequestMapping("/consumer/offer/")
public class ConsumerOfferController extends AbstractController<Consumer, Offer> {

	@Autowired
	private ConsumerOfferListActiveService	listActiveService;

	@Autowired
	private ConsumerOfferShowService		showService;

	@Autowired
	private ConsumerOfferCreateService		createService;


	@PostConstruct
	private void initialise() {
		super.addCustomCommand(CustomCommand.LIST_ACTIVE, BasicCommand.LIST, this.listActiveService);
		super.addBasicCommand(BasicCommand.SHOW, this.showService);
		super.addBasicCommand(BasicCommand.CREATE, this.createService);
	}

}
