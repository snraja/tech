//
//  ViewController.swift
//  DP
//
//  Created by Narasimha Raja on 07/11/19.
//  Copyright © 2019 Narasimha Raja. All rights reserved.
//

import UIKit

class HomeView : BaseView
{
    @IBOutlet var tempLabel : UILabel?
        
    required init?(coder: NSCoder) {
        super.init(coder: coder)
    }
    
    override func viewDidLoad()
    {
        super.viewDidLoad()
        // No temperature yet..
        self.tempLabel?.text = "-"
        
    }

    public func fetchLatestWeather() -> Void
    {
        
    }
    
    @IBAction func refreshAction(sender:UIButton) -> Void
    {
        
    }
    

}

