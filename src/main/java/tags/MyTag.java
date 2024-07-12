package tags;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.PageContext;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;

import java.io.IOException;

public class MyTag extends SimpleTagSupport {
    private String color_c;
    private int font_c;
    private boolean inUpper_Case;

    public String getColor_c() {
        return color_c;
    }

    public void setColor_c(String color_c) {
        this.color_c = color_c;
    }

    public int getFont_c() {
        return font_c;
    }

    public void setFont_c(int font_c) {
        this.font_c = font_c;
    }

    public boolean isInUpper_Case() {
        return inUpper_Case;
    }

    public void setInUpper_Case(boolean inUpper_Case) {
        this.inUpper_Case = inUpper_Case;
    }

    @Override
    public void doTag() throws JspException, IOException {
        try {
            PageContext pageContext = (PageContext) getJspContext();
            JspWriter out = pageContext.getOut();
            String style = "";
            if (inUpper_Case){
                style= "style=\"text-transform: uppercase; font-size:"+font_c+"px; color:"+color_c+";\"";
            }else {
                style="style=\"font-size:"+font_c+"px; color:"+color_c+";\"";
            }
            out.print("<p "+style+">");
            getJspBody().invoke(out);
            out.print("</p>");
        }catch (IOException e){
            throw new JspException("Error in TextFormatHandler tag"+e);
        }
    }
}
