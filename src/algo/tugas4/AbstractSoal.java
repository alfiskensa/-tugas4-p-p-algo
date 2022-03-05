package algo.tugas4;
import java.text.SimpleDateFormat;

public abstract class AbstractSoal {

	protected final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // formatter date in java
	
	protected final double distance = 1000.0;
	
	public abstract void answer() throws Exception;
	
	public abstract void opening();
}
