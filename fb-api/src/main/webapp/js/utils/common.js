var Common = {

	//EasyUI用DataGrid用日期格式化
	DateTimeSSFormatter: function (value, rec, index) {
		if (value == undefined) {
			return "";
		}
		value = value.replace(/-/g,"/");
		value = value.replace(/T/g," ");
		value = value.replace(/.000/g,"");
		var date = new Date(value );
		return date.format("yyyy-MM-dd HH:mm:ss");
	},
    //EasyUI用DataGrid用日期格式化
    DateTimeFormatter: function (value, rec, index) {
        if (value == undefined) {
            return "";
        }
        	value = value.replace(/-/g,"/");
        	value = value.replace(/T/g," ");
        	value = value.replace(/.000/g,"");
        	var date = new Date(value );
        	return date.format("yyyy-MM-dd HH:mm");
    }

    
};

