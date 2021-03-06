// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package geodistancecalculator.actions;

import java.math.BigDecimal;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import geodistancecalculator.actions.ValidateGeoDistanceCalculatorInput;

public class CalculateDistanceBetweenGeoPoints extends CustomJavaAction<java.math.BigDecimal>
{
	private java.math.BigDecimal LatitudeValueBase;
	private java.math.BigDecimal LongitudeValueBase;
	private java.math.BigDecimal LatitudeValueToCompare;
	private java.math.BigDecimal LongitudeValueToCompare;
	private java.math.BigDecimal EarthRadius;

	public CalculateDistanceBetweenGeoPoints(IContext context, java.math.BigDecimal LatitudeValueBase, java.math.BigDecimal LongitudeValueBase, java.math.BigDecimal LatitudeValueToCompare, java.math.BigDecimal LongitudeValueToCompare, java.math.BigDecimal EarthRadius)
	{
		super(context);
		this.LatitudeValueBase = LatitudeValueBase;
		this.LongitudeValueBase = LongitudeValueBase;
		this.LatitudeValueToCompare = LatitudeValueToCompare;
		this.LongitudeValueToCompare = LongitudeValueToCompare;
		this.EarthRadius = EarthRadius;
	}

	@java.lang.Override
	public java.math.BigDecimal executeAction() throws Exception
	{
		// BEGIN USER CODE
	
		ValidateGeoDistanceCalculatorInput validator = new ValidateGeoDistanceCalculatorInput();
		validator.validateValues(LatitudeValueBase, LongitudeValueBase, LatitudeValueToCompare, LongitudeValueToCompare, EarthRadius);
	
		double lat1 = LatitudeValueBase.doubleValue();
		double lng1 = LongitudeValueBase.doubleValue();
		double lat2 = LatitudeValueToCompare.doubleValue();
		double lng2 = LongitudeValueToCompare.doubleValue();
		double earthRadius = EarthRadius.doubleValue();
		
		DistanceBetweenGeoPointsCalculator calculatedDistance = new DistanceBetweenGeoPointsCalculator();
		BigDecimal distance = calculatedDistance.calculateDistance(lat1, lng1, lat2, lng2, earthRadius);
		

		return distance;
		
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "CalculateDistanceBetweenGeoPoints";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
