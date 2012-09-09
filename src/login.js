Ext.onReady(function(){
    Ext.QuickTips.init();
 
	// Create a variable to hold our EXT Form Panel. 
	// Assign various config options as seen.	 
    var login = new Ext.FormPanel({ 
        labelWidth:80,
        url:'login.php', 
        frame:true, 
		renderTo: contenedor, 
        title:'Iniciar sesi\u00f3n', 
        defaultType:'textfield',
	monitorValid:true,
	// Specific attributes for the text fields for username / password. 
	// The "name" attribute defines the name of variables sent to the server.
        items:[{ 
                fieldLabel:'Usuario:', 
                name:'usuario', 
                allowBlank:false 
            },{ 
                fieldLabel:'Contrase\u00f1a:', 
                name:'contrasena', 
                inputType:'password', 
                allowBlank:false 
            }],
 
	// All the magic happens after the user clicks the button     
        buttons:[{ 
                text:'Login',
                formBind: true,	 
                // Function that fires when user clicks the button 
                handler:function(){ 
                    login.getForm().submit({ 
                        method:'POST', 
                        waitTitle:'Conectando', 
                        waitMsg:'Enviando datos...',
 
			// Functions that fire (success or failure) when the server responds. 
			// The one that executes is determined by the 
			// response that comes from login.asp as seen below. The server would 
			// actually respond with valid JSON, 
			// something like: response.write "{ success: true}" or 
			// response.write "{ success: false, errors: { reason: 'Login failed. Try again.' }}" 
			// depending on the logic contained within your server script.
			// If a success occurs, the user is notified with an alert messagebox, 
			// and when they click "OK", they are redirected to whatever page
			// you define as redirect. 
 
                        success:function(){ 
                        	Ext.Msg.alert('Estado', '\u00a1Login exitoso!', function(btn, text){
				   							if (btn == 'ok'){
		                        				var redirect = 'pos.php'; 
		                        				window.location = redirect;
                                   			}
			        });
                        },
 
			// Failure function, see comment above re: success and failure. 
			// You can see here, if login fails, it throws a messagebox
			// at the user telling him / her as much.  
 
                        failure:function(form, action){ 
                            if(action.failureType == 'server'){ 
                                obj = Ext.JSON.decode(action.response.responseText); 
                                Ext.Msg.alert('\u00a1Login err\u00f3neo!', obj.errors.reason); 
                            }else{ 
                                Ext.Msg.alert('\u00a1Advertencia!', 'No se encuentra el servidor de autenticaci\u00f3n: ' + action.response.responseText); 
                            } 
                            login.getForm().reset(); 
                        } 
                    }); 
                } 
            }] 
    });
 
 
	// This just creates a window to wrap the login form. 
	// The login object is passed to the items collection.       
    var win = new Ext.Window({
        layout:'fit',
        width:300,
        height:150,
        closable: false,
        resizable: false,
        plain: true,
        border: false,
        items: [login]
	});
	win.show();
});