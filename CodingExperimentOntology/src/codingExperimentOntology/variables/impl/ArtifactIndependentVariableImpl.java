/**
 */
package codingExperimentOntology.variables.impl;

import codingExperimentOntology.apparatus.CodingArtifact;

import codingExperimentOntology.variables.ArtifactIndependentVariable;
import codingExperimentOntology.variables.NewPackage1Package;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Artifact Independent Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link codingExperimentOntology.variables.impl.ArtifactIndependentVariableImpl#getCodingartifact <em>Codingartifact</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArtifactIndependentVariableImpl extends CodingIndependentVariableImpl implements ArtifactIndependentVariable {
	/**
	 * The cached value of the '{@link #getCodingartifact() <em>Codingartifact</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodingartifact()
	 * @generated
	 * @ordered
	 */
	protected EList<CodingArtifact> codingartifact;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtifactIndependentVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NewPackage1Package.Literals.ARTIFACT_INDEPENDENT_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodingArtifact> getCodingartifact() {
		if (codingartifact == null) {
			codingartifact = new EObjectResolvingEList<CodingArtifact>(CodingArtifact.class, this, NewPackage1Package.ARTIFACT_INDEPENDENT_VARIABLE__CODINGARTIFACT);
		}
		return codingartifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NewPackage1Package.ARTIFACT_INDEPENDENT_VARIABLE__CODINGARTIFACT:
				return getCodingartifact();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case NewPackage1Package.ARTIFACT_INDEPENDENT_VARIABLE__CODINGARTIFACT:
				getCodingartifact().clear();
				getCodingartifact().addAll((Collection<? extends CodingArtifact>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case NewPackage1Package.ARTIFACT_INDEPENDENT_VARIABLE__CODINGARTIFACT:
				getCodingartifact().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case NewPackage1Package.ARTIFACT_INDEPENDENT_VARIABLE__CODINGARTIFACT:
				return codingartifact != null && !codingartifact.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ArtifactIndependentVariableImpl
