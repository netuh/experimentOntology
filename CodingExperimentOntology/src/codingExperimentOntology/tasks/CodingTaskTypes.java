/**
 */
package codingExperimentOntology.tasks;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Coding Task Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see codingExperimentOntology.tasks.NewPackage2Package#getCodingTaskTypes()
 * @model
 * @generated
 */
public enum CodingTaskTypes implements Enumerator {
	/**
	 * The '<em><b>Maintenance</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAINTENANCE_VALUE
	 * @generated
	 * @ordered
	 */
	MAINTENANCE(0, "maintenance", "maintenance"),

	/**
	 * The '<em><b>Writing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WRITING_VALUE
	 * @generated
	 * @ordered
	 */
	WRITING(1, "writing", "writing"),

	/**
	 * The '<em><b>Inspection</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSPECTION_VALUE
	 * @generated
	 * @ordered
	 */
	INSPECTION(2, "inspection", "inspection"),

	/**
	 * The '<em><b>Testing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TESTING_VALUE
	 * @generated
	 * @ordered
	 */
	TESTING(3, "testing", "testing"),

	/**
	 * The '<em><b>Compreension</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPREENSION_VALUE
	 * @generated
	 * @ordered
	 */
	COMPREENSION(4, "compreension", "compreension"),

	/**
	 * The '<em><b>Debbuing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEBBUING_VALUE
	 * @generated
	 * @ordered
	 */
	DEBBUING(5, "debbuing", "debbuing"),

	/**
	 * The '<em><b>Design</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DESIGN_VALUE
	 * @generated
	 * @ordered
	 */
	DESIGN(6, "design", "design");

	/**
	 * The '<em><b>Maintenance</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Maintenance</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAINTENANCE
	 * @model name="maintenance"
	 * @generated
	 * @ordered
	 */
	public static final int MAINTENANCE_VALUE = 0;

	/**
	 * The '<em><b>Writing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Writing</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WRITING
	 * @model name="writing"
	 * @generated
	 * @ordered
	 */
	public static final int WRITING_VALUE = 1;

	/**
	 * The '<em><b>Inspection</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Inspection</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INSPECTION
	 * @model name="inspection"
	 * @generated
	 * @ordered
	 */
	public static final int INSPECTION_VALUE = 2;

	/**
	 * The '<em><b>Testing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Testing</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TESTING
	 * @model name="testing"
	 * @generated
	 * @ordered
	 */
	public static final int TESTING_VALUE = 3;

	/**
	 * The '<em><b>Compreension</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Compreension</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPREENSION
	 * @model name="compreension"
	 * @generated
	 * @ordered
	 */
	public static final int COMPREENSION_VALUE = 4;

	/**
	 * The '<em><b>Debbuing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Debbuing</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEBBUING
	 * @model name="debbuing"
	 * @generated
	 * @ordered
	 */
	public static final int DEBBUING_VALUE = 5;

	/**
	 * The '<em><b>Design</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Design</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DESIGN
	 * @model name="design"
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN_VALUE = 6;

	/**
	 * An array of all the '<em><b>Coding Task Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CodingTaskTypes[] VALUES_ARRAY =
		new CodingTaskTypes[] {
			MAINTENANCE,
			WRITING,
			INSPECTION,
			TESTING,
			COMPREENSION,
			DEBBUING,
			DESIGN,
		};

	/**
	 * A public read-only list of all the '<em><b>Coding Task Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CodingTaskTypes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Coding Task Types</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CodingTaskTypes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CodingTaskTypes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Coding Task Types</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CodingTaskTypes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CodingTaskTypes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Coding Task Types</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CodingTaskTypes get(int value) {
		switch (value) {
			case MAINTENANCE_VALUE: return MAINTENANCE;
			case WRITING_VALUE: return WRITING;
			case INSPECTION_VALUE: return INSPECTION;
			case TESTING_VALUE: return TESTING;
			case COMPREENSION_VALUE: return COMPREENSION;
			case DEBBUING_VALUE: return DEBBUING;
			case DESIGN_VALUE: return DESIGN;
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
	private CodingTaskTypes(int value, String name, String literal) {
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
	
} //CodingTaskTypes
