package org.poo.banking;

/**
 * Interfata Visitor pentru aplicarea design pattern-ului Visitor.
 * Defineste metode pentru vizitarea diferitelor tipuri de tranzactii.
 */
public interface Visitor {

    /**
     * Viziteaza o tranzactie de creare a unui cont.
     * @param accountCreated Tranzactia de creare a unui cont.
     */
    void visit(AccountCreatedTransaction accountCreated);

    /**
     * Viziteaza o tranzactie de fonduri insuficiente.
     * @param insufficientFunds Tranzactia de fonduri insuficiente.
     */
    void visit(InsufficientFundsTransaction insufficientFunds);

    /**
     * Viziteaza o tranzactie de transfer de bani intre conturi.
     * @param transferTransaction Tranzactia de transfer.
     */
    void visit(TransferTransaction transferTransaction);

    /**
     * Viziteaza o tranzactie de creare a unui card.
     * @param cardCreated Tranzactia de creare a unui card.
     */
    void visit(CardCreatedTransaction cardCreated);

    /**
     * Viziteaza o tranzactie de plata cu cardul.
     * @param cardPaymentTransaction Tranzactia de plata cu cardul.
     */
    void visit(CardPaymentTransaction cardPaymentTransaction);

    /**
     * Viziteaza o tranzactie de distrugere a unui card.
     * @param cardDestroyedTransaction Tranzactia de distrugere a unui card.
     */
    void visit(CardDestroyedTransaction cardDestroyedTransaction);

    /**
     * Viziteaza o tranzactie de blocare temporara a unui card.
     * @param freezeCardTransaction Tranzactia de blocare temporara a unui card.
     */
    void visit(FreezeCardTransaction freezeCardTransaction);

    /**
     * Viziteaza o tranzactie de blocare permanenta a unui card.
     * @param cardFrozenTransaction Tranzactia de blocare permanenta a unui card.
     */
    void visit(CardFrozenTransaction cardFrozenTransaction);

    /**
     * Viziteaza o tranzactie de plata impartita intre mai multe conturi.
     * @param splitPaymentTransaction Tranzactia de plata impartita.
     */
    void visit(SplitPaymentTransaction splitPaymentTransaction);

    /**
     * Viziteaza o tranzactie de stergere a unui cont.
     * @param deleteAccountTransaction Tranzactia de stergere a unui cont.
     */
    void visit(DeleteAccountTransaction deleteAccountTransaction);

    /**
     * Viziteaza o tranzactie de modificare a ratei dobanzii pentru un cont de economii.
     * @param changeInterestRateTransaction Tranzactia de modificare a ratei dobanzii.
     */
    void visit(ChangeInterestRateTransaction changeInterestRateTransaction);
}
