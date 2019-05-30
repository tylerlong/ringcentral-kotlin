package com.ringcentral.definitions;


public class IVRMenuActionsInfo {
    /**
     * Key. The following values are supported: numeric: '1' to '9' Star Hash NoInput
     */
    public String input;

    /**
     * Internal identifier of an answering rule
     * Enum: Connect, Voicemail, DialByName, Transfer, Repeat, ReturnToRoot, ReturnToPrevious, Disconnect
     */
    public String action;

    /**
     * For 'Connect' or 'Voicemail' actions only. Extension reference
     */
    public IVRMenuExtensionInfo extension;

    /**
     * For 'Transfer' action only. PSTN number in E.164 format
     */
    public String phoneNumber;
}
