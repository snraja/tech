//
//  BaseView.swift
//  DP
//
//  Created by Narasimha Raja on 07/11/19.
//  Copyright © 2019 Narasimha Raja. All rights reserved.
//

import Foundation
import UIKit

class BaseView : UIViewController, ControllerToViewProtocol
{
    var viewActionDelegate : ViewToControllerProtocol? 
    
    required init?(coder: NSCoder) {
        super.init(coder: coder)
    }
        
    override func viewDidLoad() {
        super.viewDidLoad()
        DispatchQueue.main.async {
            self.viewActionDelegate?.viewDidLoadAsync()
        }
    }
    
    override func viewWillAppear(_ animated: Bool) {
        super.viewWillAppear(animated)
        DispatchQueue.main.async {
            self.viewActionDelegate?.viewWillAppearAsync()
        }
    }
    
    func updateView(state: String) {
        
    }

}
