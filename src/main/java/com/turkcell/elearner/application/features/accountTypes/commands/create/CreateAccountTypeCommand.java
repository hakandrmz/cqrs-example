package com.turkcell.elearner.application.features.accountTypes.commands.create;

import lombok.Builder;
import lombok.Data;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Data
@Builder
public class CreateAccountTypeCommand {

    @TargetAggregateIdentifier
    private String accountTypeId;
    private String accountName;
    private double price;
    private String description;
}
