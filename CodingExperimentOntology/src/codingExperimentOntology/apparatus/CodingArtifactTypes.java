/**
 */
package codingExperimentOntology.apparatus;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Coding Artifact Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see codingExperimentOntology.apparatus.NewPackage4Package#getCodingArtifactTypes()
 * @model
 * @generated
 */
public enum CodingArtifactTypes implements Enumerator {
	/**
	 * The '<em><b>Source Code</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOURCE_CODE_VALUE
	 * @generated
	 * @ordered
	 */
	SOURCE_CODE(0, "sourceCode", "sourceCode"),

	/**
	 * The '<em><b>Test</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEST_VALUE
	 * @generated
	 * @ordered
	 */
	TEST(1, "test", "test"),

	/**
	 * The '<em><b>Document</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOCUMENT_VALUE
	 * @generated
	 * @ordered
	 */
	DOCUMENT(2, "document", "document"),

	/**
	 * The '<em><b>Description</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DESCRIPTION_VALUE
	 * @generated
	 * @ordered
	 */
	DESCRIPTION(3, "description", "description"),

	/**
	 * The '<em><b>Others</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHERS_VALUE
	 * @generated
	 * @ordered
	 */
	OTHERS(4, "others", "others");

	/**
	 * The '<em><b>Source Code</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Source Code</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOURCE_CODE
	 * @model name="sourceCode"
	 * @generated
	 * @ordered
	 */
	public static final int SOURCE_CODE_VALUE = 0;

	/**
	 * The '<em><b>Test</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Test</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEST
	 * @model name="test"
	 * @generated
	 * @ordered
	 */
	public static final int TEST_VALUE = 1;

	/**
	 * The '<em><b>Document</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Document</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOCUMENT
	 * @model name="document"
	 * @generated
	 * @ordered
	 */
	public static final int DOCUMENT_VALUE = 2;

	/**
	 * The '<em><b>Description</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Description</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DESCRIPTION
	 * @model name="description"
	 * @generated
	 * @ordered
	 */
	public static final int DESCRIPTION_VALUE = 3;

	/**
	 * The '<em><b>Others</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Others</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OTHERS
	 * @model name="others"
	 * @generated
	 * @ordered
	 */
	public static final int OTHERS_VALUE = 4;

	/**
	 * An array of all the '<em><b>Coding Artifact Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CodingArtifactTypes[] VALUES_ARRAY =
		new CodingArtifactTypes[] {
			SOURCE_CODE,
			TEST,
			DOCUMENT,
			DESCRIPTION,
			OTHERS,
		};

	/**
	 * A public read-only list of all the '<em><b>Coding Artifact Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CodingArtifactTypes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Coding Artifact Types</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CodingArtifactTypes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CodingArtifactTypes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Coding Artifact Types</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CodingArtifactTypes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CodingArtifactTypes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Coding Artifact Types</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CodingArtifactTypes get(int value) {
		switch (value) {
			case SOURCE_CODE_VALUE: return SOURCE_CODE;
			case TEST_VALUE: return TEST;
			case DOCUMENT_VALUE: return DOCUMENT;
			case DESCRIPTION_VALUE: return DESCRIPTION;
			case OTHERS_VALUE: return OTHERS;
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
	private CodingArtifactTypes(int value, String name, String literal) {
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
	
} //CodingArtifactTypes
