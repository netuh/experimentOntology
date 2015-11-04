/**
 */
package experimentOntology.planning.designOfExperiment;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Tri Factor Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see experimentOntology.planning.designOfExperiment.DesignOfExperimentPackage#getTriFactorTypes()
 * @model
 * @generated
 */
public enum TriFactorTypes implements Enumerator {
	/**
	 * The '<em><b>Two K</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWO_K_VALUE
	 * @generated
	 * @ordered
	 */
	TWO_K(0, "TwoK", "TwoK"),

	/**
	 * The '<em><b>Half Two K</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HALF_TWO_K_VALUE
	 * @generated
	 * @ordered
	 */
	HALF_TWO_K(1, "HalfTwoK", "HalfTwoK"),

	/**
	 * The '<em><b>Quarter Two K</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUARTER_TWO_K_VALUE
	 * @generated
	 * @ordered
	 */
	QUARTER_TWO_K(2, "QuarterTwoK", "QuarterTwoK");

	/**
	 * The '<em><b>Two K</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Two K</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TWO_K
	 * @model name="TwoK"
	 * @generated
	 * @ordered
	 */
	public static final int TWO_K_VALUE = 0;

	/**
	 * The '<em><b>Half Two K</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Half Two K</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HALF_TWO_K
	 * @model name="HalfTwoK"
	 * @generated
	 * @ordered
	 */
	public static final int HALF_TWO_K_VALUE = 1;

	/**
	 * The '<em><b>Quarter Two K</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Quarter Two K</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #QUARTER_TWO_K
	 * @model name="QuarterTwoK"
	 * @generated
	 * @ordered
	 */
	public static final int QUARTER_TWO_K_VALUE = 2;

	/**
	 * An array of all the '<em><b>Tri Factor Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TriFactorTypes[] VALUES_ARRAY =
		new TriFactorTypes[] {
			TWO_K,
			HALF_TWO_K,
			QUARTER_TWO_K,
		};

	/**
	 * A public read-only list of all the '<em><b>Tri Factor Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TriFactorTypes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Tri Factor Types</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TriFactorTypes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TriFactorTypes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tri Factor Types</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TriFactorTypes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TriFactorTypes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tri Factor Types</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TriFactorTypes get(int value) {
		switch (value) {
			case TWO_K_VALUE: return TWO_K;
			case HALF_TWO_K_VALUE: return HALF_TWO_K;
			case QUARTER_TWO_K_VALUE: return QUARTER_TWO_K;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TriFactorTypes(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //TriFactorTypes
