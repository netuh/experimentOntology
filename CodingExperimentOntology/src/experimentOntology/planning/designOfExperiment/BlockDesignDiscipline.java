/**
 */
package experimentOntology.planning.designOfExperiment;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block Design Discipline</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link experimentOntology.planning.designOfExperiment.BlockDesignDiscipline#getBlock <em>Block</em>}</li>
 * </ul>
 *
 * @see experimentOntology.planning.designOfExperiment.DesignOfExperimentPackage#getBlockDesignDiscipline()
 * @model
 * @generated
 */
public interface BlockDesignDiscipline extends DesignDiscipline {
	/**
	 * Returns the value of the '<em><b>Block</b></em>' containment reference list.
	 * The list contents are of type {@link experimentOntology.planning.designOfExperiment.BlockedCharacteristic}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block</em>' containment reference list.
	 * @see experimentOntology.planning.designOfExperiment.DesignOfExperimentPackage#getBlockDesignDiscipline_Block()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<BlockedCharacteristic> getBlock();

} // BlockDesignDiscipline
