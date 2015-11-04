/**
 */
package experimentOntology.planning.designOfExperiment;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Design Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link experimentOntology.planning.designOfExperiment.DesignType#getDiscipline <em>Discipline</em>}</li>
 * </ul>
 *
 * @see experimentOntology.planning.designOfExperiment.DesignOfExperimentPackage#getDesignType()
 * @model abstract="true"
 * @generated
 */
public interface DesignType extends EObject {
	/**
	 * Returns the value of the '<em><b>Discipline</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discipline</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discipline</em>' containment reference.
	 * @see #setDiscipline(DesignDiscipline)
	 * @see experimentOntology.planning.designOfExperiment.DesignOfExperimentPackage#getDesignType_Discipline()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DesignDiscipline getDiscipline();

	/**
	 * Sets the value of the '{@link experimentOntology.planning.designOfExperiment.DesignType#getDiscipline <em>Discipline</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discipline</em>' containment reference.
	 * @see #getDiscipline()
	 * @generated
	 */
	void setDiscipline(DesignDiscipline value);

} // DesignType
