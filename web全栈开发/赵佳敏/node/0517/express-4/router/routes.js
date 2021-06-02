const express=require("express");
const router=express.Router();
const ejs=require("ejs");
router.get("/",(req,res)=>{
    ejs.renderFile("view/index.html",{list:[1,2,3]},(err,html)=>{
        if(err)
            throw err;
        res.send(html);
    });
});
module.exports=router;