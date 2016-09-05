package org.mobicents.slee.resource.map.service.mobility.subscriberInformation.wrappers;

import org.mobicents.protocols.ss7.map.api.primitives.AddressString;
import org.mobicents.protocols.ss7.map.api.primitives.MAPExtensionContainer;
import org.mobicents.protocols.ss7.map.api.service.mobility.subscriberInformation.AnyTimeModificationResponse;
import org.mobicents.protocols.ss7.map.api.service.mobility.subscriberInformation.CAMELSubscriptionInfo;
import org.mobicents.protocols.ss7.map.api.service.mobility.subscriberInformation.CallHoldData;
import org.mobicents.protocols.ss7.map.api.service.mobility.subscriberInformation.CallWaitingData;
import org.mobicents.protocols.ss7.map.api.service.mobility.subscriberInformation.ClipData;
import org.mobicents.protocols.ss7.map.api.service.mobility.subscriberInformation.ClirData;
import org.mobicents.protocols.ss7.map.api.service.mobility.subscriberInformation.EctData;
import org.mobicents.protocols.ss7.map.api.service.mobility.subscriberInformation.ExtSSInfoForCSE;
import org.mobicents.protocols.ss7.map.api.service.mobility.subscriberInformation.ODBInfo;
import org.mobicents.slee.resource.map.service.mobility.wrappers.MAPDialogMobilityWrapper;
import org.mobicents.slee.resource.map.service.mobility.wrappers.MobilityMessageWrapper;

/**
 * 
 * @author amit bhayani
 * 
 */
public class AnyTimeModificationResponseWrapper extends MobilityMessageWrapper<AnyTimeModificationResponse> implements
		AnyTimeModificationResponse {

	private static final String EVENT_TYPE_NAME = "ss7.map.service.mobility.subscriberinfo.ANY_TIME_MODIFICATION_RESPONSE";

	/**
	 * @param mAPDialog
	 */
	public AnyTimeModificationResponseWrapper(MAPDialogMobilityWrapper mAPDialog, AnyTimeModificationResponse req) {
		super(mAPDialog, EVENT_TYPE_NAME, req);
	}

	public MAPExtensionContainer getExtensionContainer() {
		return this.wrappedEvent.getExtensionContainer();
	}

	public ExtSSInfoForCSE getSsInfoForCSE() {
		return this.wrappedEvent.getSsInfoForCSE();
	}

	public CAMELSubscriptionInfo getCamelSubscriptionInfo() {
		return this.wrappedEvent.getCamelSubscriptionInfo();
	}

	public ODBInfo getOdbInfo() {
		return this.wrappedEvent.getOdbInfo();
	}

	public CallWaitingData getCwData() {
		return this.wrappedEvent.getCwData();
	}

	public CallHoldData getChData() {
		return this.wrappedEvent.getChData();
	}

	public ClipData getClipData() {
		return this.wrappedEvent.getClipData();
	}

	public ClirData getClirData() {
		return this.wrappedEvent.getClirData();
	}

	public EctData getEctData() {
		return this.wrappedEvent.getEctData();
	}

	public AddressString getServiceCentreAddress() {
		return this.wrappedEvent.getServiceCentreAddress();
	}


	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AnyTimeModificationResponseWrapper [wrapped=" + this.wrappedEvent + "]";
	}

}
