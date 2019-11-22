//
//  BaseModel.swift
//  DP
//
//  Created by Narasimha Raja on 07/11/19.
//  Copyright © 2019 Narasimha Raja. All rights reserved.
//

import Foundation

class BaseModel : ControllerToModelProtocol
{
    var modelDelegate : ModelToControllerProtocol?
    
    // For some model update call modelUpdated method with change as string
    required init() {
        
    }
    
    func updateModel(action: String) {
        
    }

}
