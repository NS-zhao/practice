/**
 * Created by zjm on 2021/11/6.
 */
(function(window,undefined){
    //定义了相关变量
    var _jquery=window.jQuery,
        _$=window.$,
        jQuery=function(selector,content){
            //返回一个对象
            return new jQuery.fn.init(selector,content,undefined);
        }
    jQuery.fn=jQuery.prototype={
        constructor:jQuery,
        init:function(selector,context,rootjQuery){
            if(!selector){
                //$("") $(null)  $(undefined) $(false)
                return this;
            }
        },
        add:function(){

        }
    }
    jQuery.fn.init.prototype=jQuery.fn;
    //jQuery函数
    window.$=window.jQuery=jQuery;
})(window);