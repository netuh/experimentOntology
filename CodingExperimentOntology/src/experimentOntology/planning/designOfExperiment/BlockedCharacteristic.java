/**
 */
package experimentOntology.planning.designOfExperiment;

import experimentOntology.planning.threats.Threat;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Blocked Characteristic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link experimentOntology.planning.designOfExperiment.BlockedCharacteristic#getThreat <em>Threat</em>}</li>
 * </ul>
 *
 * @see experimentOntology.planning.designOfExperiment.DesignOfExperimentPackage#getBlockedCharacteristic()
 * @model
 * @generated
 */
public interface BlockedCharacteristic extends EObject {
	/**
	 * Returns the value of the '<em><b>Threat</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Threat</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threat</em>' reference.
	 * @see #setThreat(Threat)
	 * @see experimentOntology.planning.designOfExperiment.DesignOfExperimentPackage#getBlockedCharacteristic_Threat()
	 * @model
	 * @generated
	 */
	Threat getThreat();

	/**
	 * Sets the value of the '{@link experimentOntology.planning.designOfExperiment.BlockedCharacteristic#getThreat <em>Threat</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Threat</em>' reference.
	 * @see #getThreat()
	 * @generated
	 */
	void setThreat(Threat value);

} // BlockedCharacteristic
