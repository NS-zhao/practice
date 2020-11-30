/**
 * Created by maodou on 2020/11/14.
 */
$(function () {
    $(".nav").click(function () {
        $(".menu_list").show();
    });
    $(".close").click(function () {
        $(".menu_list").hide();
        $(".child_menu").slideUp();
    });
    $(".s_menu").each(function (index) {
        $(this).click(function () {
            $(this).toggleClass("rotateDEG");
            $(".child_menu").eq(index).slideToggle();
        })
    });
})